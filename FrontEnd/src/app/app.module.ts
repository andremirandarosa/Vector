import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms'
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

//=== Service ===
import { BackendService } from './service/backend/backend.service';

//=== MATERIAL ===
import {MatInputModule} from '@angular/material/input';
import {MatButtonModule} from '@angular/material/button';
import {MatTableModule} from '@angular/material/table';
import {MatCardModule} from '@angular/material/card';


@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    FormsModule,
    HttpClientModule,

    //=== MATERIAL ===
    MatInputModule,
    MatButtonModule,
    MatTableModule,
    MatCardModule
  ],
  providers: [BackendService],
  bootstrap: [AppComponent]
})
export class AppModule { }
