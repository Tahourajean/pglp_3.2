package uvsq.fr;

/**
 * John !
 *
 */
public class Vendeur extends Personne
{

  public Vendeur(){
  super();
}
@Override
 public double calculeSalaire(double commission)
    {
        return 1000.0+commission;
    }
}

