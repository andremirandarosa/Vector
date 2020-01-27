import { Component, ViewChild, ElementRef } from '@angular/core';
import {MatTable} from '@angular/material';

import { ContaDTO } from './ContaDTO';

import { BackendService } from './service/backend/backend.service';
 
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  
  agencia : String;
  conta: String;

  dataSource : ContaDTO[] = [];
  displayedColumns: string[] = ['agencia', 'conta'];

  @ViewChild(MatTable,{static:false}) table: MatTable<ContaDTO>;

  @ViewChild("form",{static:true}) form: ElementRef;

  //============================================================

  constructor(private backendService : BackendService){}

  adicionaConta(){

    var dto = {
      'agencia': Number(this.agencia),
      'conta': Number(this.conta)
    }

    this.backendService.save(dto)
                         .subscribe((data: any) => {
                            console.log('SAVOU OK...');
                            
                            this.atualizaTabela();
                            this.form.nativeElement.reset();
                          },
                          (err) => {
                            console.log('ERRO AO SALVAR: ' + err);
                          }
                        );

    // this.atualizaTabela();
  }

  atualizaTabela(){

    this.dataSource.push({
        'agencia': Number(this.agencia),
        'conta': Number(this.conta)
      });

    this.table.renderRows();

    this.agencia = '';
    this.conta = '';
  }

  verificaQuantidadeContas() : number{
    return this.dataSource.length;
  }
}
