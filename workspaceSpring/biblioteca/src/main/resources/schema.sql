CREATE TABLE `biblioteca` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Codice` text,
  `Autore` text,
  `Titolo` text,
  `Editore` text,
  `Anno` text,
  `Luogo` text,
  `Pagine` int(11) DEFAULT NULL,
  `Classificazione` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=910;