import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Usuarios } from '../model/Usuarios';

@Injectable({
  providedIn: 'root'
})
export class UsuariosService {

  constructor(
    private http: HttpClient
  ) { }

  postUsuario(usuario:Usuarios): Observable<Usuarios>{
    return this.http.post<Usuarios>('http://localhost:8080/usuarios/cadastrar', usuario)
  }
}
