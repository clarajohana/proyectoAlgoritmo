package modelo;
import java.util.ArrayList;

public class PlanRegistro {
	private  int planId;
	private  String planTipo;
	private  double planCosto;

	//LISTA
	private ArrayList<ClarPadMiembro> lstMiembros= new ArrayList<ClarPadMiembro>();

	//GET AND SET
	public int darPlanId() {
		return planId;
	}
	public void actualizarPlanId(int planId) {
		this.planId = planId;
	}
	public String darPlanTipo() {
		return planTipo;
	}
	public void actualizarPlanTipo(String planTipo) {
		this.planTipo = planTipo;
	}
	public double darPlanCosto() {
		return planCosto;
	}
	public void actualizarPlanCosto(double planCosto) {
		this.planCosto = planCosto;
	}

	//CONSTRUCTOR
	public PlanRegistro(int planId, String planTipo, double planCosto) {
		super();
		this.planId = planId;
		this.planTipo = planTipo;
		this.planCosto = planCosto;
	}
	//INICIALIZACION DEL CONSTRUCTOR
	public PlanRegistro() {
		this.planId = 0;
		this.planTipo = " ";
		this.planCosto = 0;
	}

	//AGREGAR UN MIEMBRO
	public void agregarMiembro(ClarPadMiembro m) {
		lstMiembros.add(m);
	}
	//IMPRIMIR DATOS DE REGISTRO 
	public void printData(){
		System.out.printf("%d\t%s\t%8.3f\n",planId,planTipo,planCosto);
	}

	//IMPRIMIR LOS MIEMBROS
	public  void imprimirMiembros() {
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("ID\t NOMBRE \t APELLIDO \t CORREO \t 	CONTRASEÑA");
		System.out.println("-----------------------------------------------------------------------------------------");
		for(ClarPadMiembro m:lstMiembros) {
			m.imprimirDatosDeMiembro();
		}
	}

	//TOTAL DE LOS MIEMBROS
	public int totalMiembros(){
		return lstMiembros.size();
	}


}
