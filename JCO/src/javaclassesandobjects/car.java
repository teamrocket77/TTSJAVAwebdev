package javaclassesandobjects;

public class car {
	private String _make, _model, _type;
	private boolean _running = false;
	
	
	public car() {
		
	}
	public car(String Make, String Model) {
		_make = Make;
		_model = Model;
	}
	public car(String Make, String Model, String Type) {
		_make = Make;
		_model = Model;
		_type = Type;
	}
	public String get_make() {
		return _make;
	}
	public void set_make(String _make) {
		this._make = _make;
	}
	public String get_model() {
		return _model;
	}
	public void set_model(String _model) {
		this._model = _model;
	}
	public String get_type() {
		return _type;
	}
	public void set_type(String _type) {
		this._type = _type;
	}
	public void start() {
		_running = true;
	}
	public boolean isrunning(){
		return _running;
	}

}
