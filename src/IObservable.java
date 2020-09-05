public interface IObservable {
    void addObserver(IObserver o);
	
	void notificarObservadores();
	

}