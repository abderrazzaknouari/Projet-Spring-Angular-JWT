package abderrazzak.enset.ebanking.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@Entity
//@DiscriminatorValue("CA")
@AllArgsConstructor @NoArgsConstructor
public class CurrentAccount extends BankAccount{
    private double overDraft;
    // Découvert : montant négatif autorisé

    /*Ici on a 3 possibilittés:
    - Single Table: une seule table pour les 3 classes
    - Table per class: une table pour chaque classe
    - Joined: une table pour la classe mère et une table pour chaque classe fille
     */
}
