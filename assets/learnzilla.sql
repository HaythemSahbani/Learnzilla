DROP SCHEMA IF EXISTS learnzilla;
CREATE SCHEMA IF NOT EXISTS learnzilla;
USE learnzilla;

CREATE TABLE IF NOT EXISTS Fragen
( fragenid int NOT NULL auto_increment,
frage varchar(200) NOT NULL,
fk_kategorie int NOT null,
schwierigkeit int NOT null,
primary key(fragenid)
);

CREATE TABLE IF NOT EXISTS Antworten
( antwortenid int NOT NULL auto_increment,
antwort varchar(200) NOT NULL,
primary key(antwortenid)
);

CREATE TABLE IF NOT EXISTS FragenAntwortenMapping
(
fk_frage int NOT null,
fk_antwort int NOT null,
primary key(fk_frage,fk_antwort)
);

CREATE TABLE IF NOT EXISTS Kategorie
( kategorieid int NOT NULL auto_increment,
beschreibung varchar(20),
primary key(kategorieid)
);

CREATE TABLE IF NOT EXISTS Zitate
( zitatid int NOT NULL auto_increment,
zitat varchar(400),
primary key (zitatid)
);

CREATE TABLE IF NOT EXISTS Benutzer
( benutzerid int NOT NULL auto_increment,
benutzername varchar(40),
passwort varchar(20),
is_online boolean,
fettigkeitsgrad int,
highscore int,
primary key(benutzerid)
);

CREATE TABLE IF NOT EXISTS Benutzer_Frage
(
benfragid int NOT NULL auto_increment,
fk_benutzer int NOT NULL,
fk_frage int NOT NULL,
is_done boolean,
primary key (benfragid)
);

/*
CREATE TABLE IF NOT EXISTS Schwierigkeitsgrad
( skid int NOT NULL auto_increment,
beschreibung varchar(20),
primary key(skid)
);
*/


ALTER TABLE FRAGEN
ADD CONSTRAINT fk_Fragen_Kategorie
FOREIGN KEY (fk_kategorie)
REFERENCES Kategorie(kategorieid);


/*
ALTER TABLE FRAGEN
ADD CONSTRAINT fk_Fragen_Schwierigkeit
FOREIGN KEY (fk_schwierigkeit)
REFERENCES Schwierigkeitsgrad(skid);
*/


ALTER TABLE Antworten
ADD CONSTRAINT fk_Anworten_Kategorie
FOREIGN KEY (fk_kategorie)
REFERENCES Kategorie(kategorieid);

ALTER TABLE FragenAntwortenMapping
ADD CONSTRAINT fk_FragenAntwortenMapping_Fragen
FOREIGN KEY (fk_frage)
REFERENCES Fragen(fragenid);

ALTER TABLE FragenAntwortenMapping
ADD CONSTRAINT fk_FragenAntwortenMapping_Antworten
FOREIGN KEY (fk_antwort)
REFERENCES Antworten(antwortenid);

ALTER TABLE Benutzer_Frage
ADD CONSTRAINT fk_Benutzer_Frage_Benutzer
FOREIGN KEY (fk_benutzer)
REFERENCES Benutzer(benutzerid);

ALTER TABLE Benutzer_Frage
ADD CONSTRAINT fk_Benutzer_Frage_Frage
FOREIGN KEY (fk_frage)
REFERENCES Fragen(fragenid);

