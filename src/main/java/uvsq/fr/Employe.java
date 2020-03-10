package uvsq.fr;

/**
 * John !
 *
 */
public class Employe extends Personne
{
   public Employe(){
super();
}
    public double calculeSalaire(int nbAnciennete)
    {
        return 1500+nbAnciennete*20;
    }
}
