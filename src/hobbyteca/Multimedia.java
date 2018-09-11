package hobbyteca;

import java.util.Objects;

public class Multimedia{
	
	private final String clase;
	private final String título;
	private final int año;
	private final String creador;
	private final int valoración;
	private final String url;
	
	public Multimedia(String clase, String título, int año, String creador, int valoración, String url){
            this.clase = clase;
            this.título = título;
            this.año = año;
            this.creador = creador;
            this.valoración = valoración;
            this.url = url;
	}
	
	public String getClase(){
            return clase;
	}
	
	public String getTítulo(){
            return título;
	}
	
	public int getAño(){
            return año;
	}
	
	public String getCreador(){
            return creador;
	}
	
	public int getValoración(){
            return valoración;
	}
	
	public String getUrl(){
            return url;
	}
	
	@Override
	public boolean equals(Object o){
            if(o instanceof Multimedia){
		Multimedia m = (Multimedia) o;
		return m.getTítulo().equalsIgnoreCase(this.getTítulo());
            }
            return false;
	}

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 83 * hash + Objects.hashCode(this.clase);
            hash = 83 * hash + Objects.hashCode(this.título);
            hash = 83 * hash + this.año;
            hash = 83 * hash + Objects.hashCode(this.creador);
            hash = 83 * hash + this.valoración;
            hash = 83 * hash + Objects.hashCode(this.url);
            return hash;
        }
	
	@Override
	public Object clone() throws CloneNotSupportedException{
            return (Multimedia)super.clone();
	}
	
	@Override
	public String toString(){
            return "[" + this.clase + "] " + this.título + " (" + this.año + ") | " + this.creador + " | " + this.valoración;
	}
}