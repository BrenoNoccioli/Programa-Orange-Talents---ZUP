import { Component, OnInit } from '@angular/core';
import { VacinasAplicadas } from '../model/VacinasAplicadas';
import { VacinasService } from '../service/vacinas.service';

@Component({
  selector: 'app-vacinas',
  templateUrl: './vacinas.component.html',
  styleUrls: ['./vacinas.component.css']
})
export class VacinasComponent implements OnInit {

  vacina: VacinasAplicadas = new VacinasAplicadas;

  constructor(
    private service: VacinasService
  ) { }

  ngOnInit(): void {
  }

  cadastrar(){
    this.service.postVacina(this.vacina).subscribe((resp)=>{
      this.vacina = resp;
      alert('Aplicação cadastrada com sucesso!');
      this.vacina = new VacinasAplicadas
    })
  }

}
