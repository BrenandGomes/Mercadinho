package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Enumerados.Pago;
import Enumerados.StatusVenda;
import Enumerados.TipoPagamento;

public class Venda {

private 	List <ItemVenda> item = new ArrayList<>();
private cliente cliente=null;
private Pago pago=null;
private StatusVenda status=null;
private TipoPagamento tipoPagamento=null;
private Date noew = new Date();
private Integer number=null;
private Integer parcelas=null;
private Double desconto=null;


}
