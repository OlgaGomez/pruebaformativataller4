package py.edu.facitec.springtaller.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Vendedor {

	@Id
	@GeneratedValue
	private Integer id;
	private String nombre;
	private double salario;
	
	@OneToMany (mappedBy="vendedor")
	private List<Factura> listaFactura;
	
	public Vendedor() {
		id=0;
		nombre="";
		salario=0.0;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Vendedor [id=" + id + ", nombre=" + nombre + ", salario=" + salario + "]";
	}
	
	
}
