# Decorator

- Folosit pentru modificarea functionalitatii unui obiect la runtime

- Use-case: Adaugarea de noi functionalitati pentru clasele existente

- **Sintagma:** Vrea sa ofere pentru o perioada de timp / Vrea sa adauge temporar

```java
public abstract class OfertaPachetTuristic implements PachetTuristic {
 private PachetTuristic pachetTuristic;
 
 public OfertaPachetTuristic(PachetTuristic pachetTuristic) {
  this.pachetTuristic = pachetTuristic;
 }

 public void descriere(){
  pachetTuristic.descriere();
 }
 
 public abstract void anulareRezervare();
}
```

- In clasa mea decorator creez o instanta a clasei mele concrete actuale

## Adapter vs Decorator

- Fac acelasi lucru, dar decorator-ul adauga si functionalitati noi
