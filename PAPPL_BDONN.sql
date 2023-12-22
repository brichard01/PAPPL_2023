
CREATE TABLE mail (
                id_mail VARCHAR NOT NULL,
                corps_message VARCHAR,
                jour INTEGER,
                CONSTRAINT mail_pk PRIMARY KEY (id_mail)
);


CREATE TABLE redevable (
                adresse_mail_redevable VARCHAR NOT NULL,
                nom VARCHAR NOT NULL,
                CONSTRAINT redevable_pk PRIMARY KEY (adresse_mail_redevable)
);


CREATE TABLE agent_comptable (
                id_agent VARCHAR NOT NULL,
                statur_agent BOOLEAN DEFAULT TRUE NOT NULL,
                adresse_mail_agent VARCHAR NOT NULL,
                nom_agent VARCHAR NOT NULL,
                CONSTRAINT agent_comptable_pk PRIMARY KEY (id_agent)
);


CREATE TABLE dette (
                id_dette VARCHAR NOT NULL,
                libelle VARCHAR,
                montant DOUBLE PRECISION NOT NULL,
                info_complementaire VARCHAR,
                action_effectuee VARCHAR,
                statut_dette BOOLEAN NOT NULL,
                action_entreprendre VARCHAR,
                date_creation TIMESTAMP NOT NULL,
                adresse_mail_redevable VARCHAR NOT NULL,
                id_agent VARCHAR NOT NULL,
                CONSTRAINT dette_pk PRIMARY KEY (id_dette)
);


CREATE TABLE echeance (
                id_echeance VARCHAR NOT NULL,
                date_deadline TIMESTAMP NOT NULL,
                montant_echeance DOUBLE PRECISION NOT NULL,
                statut_paiement BOOLEAN DEFAULT FALSE NOT NULL,
                statut_annulation BOOLEAN DEFAULT FALSE NOT NULL,
                date_paiement TIMESTAMP,
                raison_annulation VARCHAR,
                id_dette VARCHAR NOT NULL,
                CONSTRAINT echeance_pk PRIMARY KEY (id_echeance)
);


ALTER TABLE dette ADD CONSTRAINT redevable_dette_fk
FOREIGN KEY (adresse_mail_redevable)
REFERENCES redevable (adresse_mail_redevable)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE dette ADD CONSTRAINT agent_comptable_dette_fk
FOREIGN KEY (id_agent)
REFERENCES agent_comptable (id_agent)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE echeance ADD CONSTRAINT dette_echeance_fk
FOREIGN KEY (id_dette)
REFERENCES dette (id_dette)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

CREATE SEQUENCE echeance_sequence
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
