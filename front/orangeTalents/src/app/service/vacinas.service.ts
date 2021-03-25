import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { VacinasAplicadas } from '../model/VacinasAplicadas';

@Injectable({
  providedIn: 'root'
})
export class VacinasService {

  constructor(
    private http: HttpClient
  ) { }

  postVacina(vacina:VacinasAplicadas): Observable<VacinasAplicadas>{
    return this.http.post<VacinasAplicadas>('http://localhost:8080/vacinas/cadastrar', vacina)
  }
}
