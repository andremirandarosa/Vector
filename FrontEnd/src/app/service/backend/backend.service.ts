import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { ContaDTO } from '../../ContaDTO';

@Injectable({
  providedIn: 'root'
})
export class BackendService {

  constructor(private http: HttpClient) {}  

  save(dto : ContaDTO){        
    // return this.http.post('./api', dto);    
    return this.http.post('http://localhost:8080/api', dto);    
  }
}
