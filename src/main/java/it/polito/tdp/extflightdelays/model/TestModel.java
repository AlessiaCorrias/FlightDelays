package it.polito.tdp.extflightdelays.model;

public class TestModel {

	public static void main(String[] args) {
		
		Model model = new Model();
		model.creaGrafo(10);
		
		System.out.println("numero vertici" + model.edgeNumber());
		
		System.out.println(model.getAeroporti());

	}

}
