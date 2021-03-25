import { VacinasAplicadas } from "./VacinasAplicadas";

export class Usuarios{

  public id: number;

  public nome: string;

  public email: string;

  public cpf: string;

  public nascimento: Date;

  public vacinas: VacinasAplicadas[];

}