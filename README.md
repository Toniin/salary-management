Employé = {
  nom,
  prénom,
  âge,
  date d'entrée en service,
  salaire mensuel
}

Type d'Employé :
  Vendeur => Salaire = 400€ + chiffre d'affaire effectué * 20%
  Représentant => Salaire = 800€ + chiffre d'affaire effectué * 20%
  Producteur => Unités produites * 5€
  Manutentionnaire => Nombre d'heures * 65€

+200€ pour manipulation produits dangereux

PROGRAMME => Afficher les détails des employés + Salaire moyen

Indépendants = {
  nom,
  n°SIREN,
  facture[],
  salaire: somme de facture[] ⚠️ facture.libellé = "Frais de déplacement" => Pas pris en compte dans le calcul du salaire
}

facture = {
  date,
  somme (en €),
  libellé (nature de la prestation)
}