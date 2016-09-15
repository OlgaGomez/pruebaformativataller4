package py.edu.facitec.springtaller.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Factura {

	@Id
	@GeneratedValue
	private Integer id;
	private double monto;
	private String ruc;
	//variable composicion
	private Vendedor vend;
	//variable oneToMany
	private Vendedor vendedor;
	
	public Factura() {
		id=0;
		monto=0.0;
		ruc="";
		//aplicacion de la composicion
		vend= new Vendedor();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	@Override
	public String toString() {
		return "Factura [id=" + id + ", monto=" + monto + ", ruc=" + ruc + "]";
	}
	
}
