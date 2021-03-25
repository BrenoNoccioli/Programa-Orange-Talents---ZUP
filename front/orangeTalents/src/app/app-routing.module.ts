import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UsuariosComponent } from './usuarios/usuarios.component';
import { VacinasComponent } from './vacinas/vacinas.component';

const routes: Routes = [
  {path:'', redirectTo:'usuarios', pathMatch:'full'},

  {path: 'usuarios', component: UsuariosComponent},
  {path: 'vacinas', component: VacinasComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
