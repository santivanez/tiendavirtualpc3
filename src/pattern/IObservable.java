package pattern;

import pattern.IObserver;

public interface IObservable {
    void addObserver(IObserver o);
	
	void notificarObservadores();
	

}