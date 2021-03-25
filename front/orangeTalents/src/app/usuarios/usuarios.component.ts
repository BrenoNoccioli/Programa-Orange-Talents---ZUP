import { Component, OnInit } from '@angular/core';
import { Usuarios } from '../model/Usuarios';
import { UsuariosService } from '../service/usuarios.service';

@Component({
  selector: 'app-usuarios',
  templateUrl: './usuarios.component.html',
  styleUrls: ['./usuarios.component.css']
})
export class UsuariosComponent implements OnInit {

  usuario: Usuarios = new Usuarios;
  

  constructor(
    private service: UsuariosService
  ) { }

  ngOnInit(){
    window.scroll(0,0)
  }

  cadastrarUsuario(){
    this.service.postUsuario(this.usuario).subscribe((resp: Usuarios)=>{
      this.usuario = resp;
      alert('Usuário cadastrado com sucesso!');
      this.usuario = new Usuarios;
    })
  }

}
