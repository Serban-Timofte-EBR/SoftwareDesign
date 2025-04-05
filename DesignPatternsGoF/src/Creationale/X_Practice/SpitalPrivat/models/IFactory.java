package Creationale.X_Practice.SpitalPrivat.models;

public interface IFactory {
    Pacient createNewPatient(String nume, Diagnostice diagnostic);
}
