package exer9.exer9_2;



public interface HandlerChain {
	
	void setNextChain(HandlerChain nextChain);
	void handleRequest(int requisicao);

}
