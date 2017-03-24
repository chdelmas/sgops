/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.gouv.faes.ops;

import java.util.Date;

/**
 *
 * @author chdelmas
 */
public class Prestataire {
public String _code;
        public boolean _listenoirepermanent;
        public boolean _listenoireprovisoire;
        public boolean _estvalide;
        public Date _enregistrement;
        public String _enregistrerpar;
        public String _prestataire_firme;
        public String _SPG_code;
        public int _formeid;
        public int _NationaliteID;
        public Date _dateconstitution;
        public String _adresse;
        public String _adresse1;
        public int _CommuneID;
        public String _telephone;
        public String _cellulaire;
        public String _email;
        public String _fax;
        public String _website;
        public String _patente;
        public String _secteur;
        public String _nif;
        public String _affiliation;
        public String _mission;
        public String _objectifs;
        public String _methodologie;
        public String _chiffreAffaires;
        public String _coutsAdministratifs;
        public int _id;

 

//        public  void insererprestataire (String code,boolean listperm,boolean listprov,boolean valide,DateTime enregistrement,String enregitrerpar,String firme, String sgp,
//                                         int formeid,int nationaliteid,DateTime constitution,String adresse,String adresse1,int communeid,String telephone,String cellulaire,
//                                         String email,String fax,String web,String patente,String secteur,String nif,String affiliation,String mission,String objectif,String methodologie,
//                                          String chiffre,String couts)
//        {
//            _code = code;
//            _listenoirepermanent = listperm;
//            _listenoireprovisoire = listprov;
//            _estvalide = valide;
//            _enregistrement = enregistrement;
//            _enregistrerpar = enregitrerpar;
//            _prestataire_firme = firme;
//            _SPG_code = sgp;
//            _formeid = formeid;
//            _NationaliteID = nationaliteid;
//            _dateconstitution = constitution;
//            _adresse = adresse;
//            _adresse1 = adresse1;
//            _CommuneID = communeid;
//            _telephone = telephone;
//            _cellulaire = cellulaire;
//            _email = email;
//            _fax = fax;
//            _website = web;
//            _patente = patente;
//            _secteur = secteur;
//            _nif = nif;
//            _affiliation = affiliation;
//            _mission = mission;
//            _objectifs = objectif;
//            _methodologie = methodologie;
//            _chiffreAffaires = chiffre;
//            _coutsAdministratifs = couts;
//           
//            String connection = ConfigurationManager.ConnectionStrings["ConSQL"].ToString(); // connection String
//            SqlConnection con = new SqlConnection(connection);
//            SqlCommand cmd = new SqlCommand();
//            SqlParameter parm = new SqlParameter();
//            con.Open();
//            try
//            {
//                cmd = new SqlCommand("SP_Tay_InsertPrestataire", con);
//                cmd.CommandType = CommandType.StoredProcedure;
//                parm = cmd.Parameters.Add("@Code", SqlDbType.NChar, 5);
//                parm.Value = _code;
//
//                parm = cmd.Parameters.Add("@ListeNoirePermanent", SqlDbType.Bit);
//                parm.Value = _listenoirepermanent;
//
//                parm = cmd.Parameters.Add("@ListeNoireProvisoire", SqlDbType.Bit);
//                parm.Value =_listenoireprovisoire;
//
//                parm = cmd.Parameters.Add("@Prestataire_EstValide", SqlDbType.Bit);
//                parm.Value = _estvalide;
//
//                parm = cmd.Parameters.Add("@Prestataire_EnregistrementDate", SqlDbType.DateTime);
//                parm.Value = _enregistrement;
//
//                parm = cmd.Parameters.Add("@Prestataire_EnregistrementPar", SqlDbType.VarChar);
//                parm.Value = _enregistrerpar;
//
//
//
//                parm = cmd.Parameters.Add("@Prestataire_Firme", SqlDbType.VarChar);
//                parm.Value = _prestataire_firme;
//
//                parm = cmd.Parameters.Add("@Prestataire_SGPcode", SqlDbType.VarChar);
//                parm.Value = _SPG_code;
//
//                parm = cmd.Parameters.Add("@FormeLegaleId", SqlDbType.Int);
//                parm.Value = _formeid;
//
//                parm = cmd.Parameters.Add("@NationaliteID", SqlDbType.Int);
//                parm.Value = _NationaliteID;
//
//                parm = cmd.Parameters.Add("@Prestataire_DateConstitution", SqlDbType.DateTime);
//                parm.Value = _dateconstitution;
//
//                parm = cmd.Parameters.Add("@Prestataire_Addresse1", SqlDbType.VarChar);
//                parm.Value = _adresse;
//
//                parm = cmd.Parameters.Add("@Prestataire_Addresse2", SqlDbType.VarChar);
//                parm.Value = _adresse1;
//
//                parm = cmd.Parameters.Add("@CommuneId", SqlDbType.Int);
//                parm.Value = _CommuneID;
//
//                parm = cmd.Parameters.Add("Prestataire_Telephone", SqlDbType.VarChar);
//                parm.Value = _telephone;
//
//                parm = cmd.Parameters.Add("@Prestataire_Cellulaire", SqlDbType.VarChar);
//                parm.Value = _cellulaire;
//
//                parm = cmd.Parameters.Add("@Prestataire_Email", SqlDbType.VarChar);
//                parm.Value = _email;
//
//                parm = cmd.Parameters.Add("@Prestataire_Fax", SqlDbType.VarChar);
//                parm.Value = _fax;
//
//                parm = cmd.Parameters.Add("@Prestataire_WebSite", SqlDbType.VarChar);
//                parm.Value = _website;
//
//                parm = cmd.Parameters.Add("@Prestataire_Patente", SqlDbType.VarChar);
//                parm.Value = _patente;
//
//                parm = cmd.Parameters.Add("@Prestataire_PatenteSecteur", SqlDbType.VarChar);
//                parm.Value = _secteur;
//
//                parm = cmd.Parameters.Add("@Prestataire_NIF", SqlDbType.VarChar);
//                parm.Value = _nif;
//
//                parm = cmd.Parameters.Add("@Prestataire_Affiliation", SqlDbType.VarChar);
//                parm.Value = _affiliation;
//
//                parm = cmd.Parameters.Add("@Prestataire_Mission", SqlDbType.Text);
//                parm.Value = _mission;
//
//
//                parm = cmd.Parameters.Add("@Prestataire_Objectifs", SqlDbType.Text);
//                parm.Value = _objectifs;
//
//                parm = cmd.Parameters.Add("@Prestataire_Methodologie", SqlDbType.Text);
//                parm.Value = _methodologie;
//
//                parm = cmd.Parameters.Add("@Prestataire_ChiffreAffaires", SqlDbType.VarChar);
//                parm.Value = _chiffreAffaires;
//
//                parm = cmd.Parameters.Add("@Prestataire_CoutsAdministratifs", SqlDbType.VarChar);
//                parm.Value = _coutsAdministratifs;
//
//                //cmd.Parameters.Add("@id", SqlDbType.Int).Direction = ParameterDirection.Output;
//
//
//                // cmd.ExecuteNonQuery();
//                //String id = cmd.Parameters["@id"].Value.ToString();
//                object obj = cmd.ExecuteScalar();
//                System.Windows.Forms.MessageBox.Show("Nouveau Prestataire Enregistré . ID = " + obj.ToString());
//
//            }
//            catch
//            {
//
//            }
//
//            finally
//            {
//                con.Close();
//
//            }
//        }
//        public void SelectPrestataire(int id) {
//            _id = id;
//             String connection = ConfigurationManager.ConnectionStrings["ConSQL"].ToString(); // connection String
//        SqlConnection con = new SqlConnection(connection);
//        SqlCommand cmd = new SqlCommand();
//        SqlParameter parm = new SqlParameter();
//        SqlDataReader r;
//        con.Open();
//        try
//        {
//            cmd = new SqlCommand("SP_Tay_RechSelectPrestataire", con);
//            cmd.CommandType = CommandType.StoredProcedure;
//            parm = cmd.Parameters.Add("@firme", SqlDbType.Int);
//            parm.Value = _id;
//
//           
//
//            //cmd.Parameters.Add("@id", SqlDbType.Int).Direction = ParameterDirection.Output;
//
//
//            r = cmd.ExecuteReader();
//            if(r.Read()){
//                updatefields(r);
//
//            }
//           
//
//        }
//        catch
//        {
//
//        }
//
//        finally
//        {
//            con.Close();
//
//        }
//        
//    }
//        private void updatefields(SqlDataReader r) {
//            Code = r["Prestataire_Code"].ToString();
//            Firme = r["Prestataire_Firme"].ToString();
//            FormeID = int.Parse(r["Prestataire_FormeLegaleId"].ToString());
//
//            Nationalite =  int.Parse(r["Prestataire_NationliteId"].ToString());
//            DateConstitution = DateTime.Parse(r["Prestataire_DateConstitution"].ToString());
//            Adresse = r["Prestataire_Addresse2"].ToString();
//
//            Commune = int.Parse( r["Prestataire_CommuneId"].ToString());
//            Telephone = r["Prestataire_Telephone"].ToString();
//            Cellulaire = r["Prestataire_Cellulaire"].ToString();
//
//            Email = r["Prestataire_Email"].ToString();
//            Fax = r["Prestataire_Fax"].ToString();
//            Web = r["Prestataire_WebSite"].ToString();
//
//            Patente = r["Prestataire_Patente"].ToString();
//            Secteur = r["Prestataire_PatenteSecteur"].ToString();
//            NIF = r["Prestataire_NIF"].ToString();
//            Chiffre = r["Prestataire_ChiffreAffaires"].ToString();
//            Couts =r["Prestataire_CoutsAdministratifs"].ToString();
//        }
//        public void UpdatePrestataire(String code, String Enregist, DateTime Enregistrement, String firme,
//                                         int formeid, int nationaliteid, DateTime constitution, String adresse,int communeid, String telephone, String cellulaire,
//                                         String email, String fax, String web, String patente, String secteur, String nif, String affiliation, 
//                                          String chiffre, String couts,int id)
//        {
//            _code = code;
//            _id = id;
//            _enregistrement = Enregistrement;
//            _enregistrerpar = Enregist;
//            _prestataire_firme = firme;
//            
//            _formeid = formeid;
//            _NationaliteID = nationaliteid;
//            _dateconstitution = constitution;
//            _adresse = adresse;
//           
//            _CommuneID = communeid;
//            _telephone = telephone;
//            _cellulaire = cellulaire;
//            _email = email;
//            _fax = fax;
//            _website = web;
//            _patente = patente;
//            _secteur = secteur;
//            _nif = nif;
//            _affiliation = affiliation;
//            
//            _chiffreAffaires = chiffre;
//            _coutsAdministratifs = couts;
//
//           
//
//            String connection = ConfigurationManager.ConnectionStrings["ConSQL"].ToString(); // connection String
//            SqlConnection con = new SqlConnection(connection);
//            SqlCommand cmd = new SqlCommand();
//            SqlParameter parm = new SqlParameter();
//            con.Open();
//            try
//            {
//                cmd = new SqlCommand("SP_Tay_UpdatePrestataire", con);
//                cmd.CommandType = CommandType.StoredProcedure;
//                parm = cmd.Parameters.Add("@code", SqlDbType.NChar, 5);
//                parm.Value = _code;
//
//                parm = cmd.Parameters.Add("@firme", SqlDbType.Int);
//                parm.Value = _id;
//
//                parm = cmd.Parameters.Add("@Prestataire_ActualisationDate", SqlDbType.DateTime);
//                parm.Value = _enregistrement;
//
//                parm = cmd.Parameters.Add("@Prestataire_ActualisationPar", SqlDbType.VarChar,50);
//                parm.Value = _enregistrerpar;
//
//
//
//                parm = cmd.Parameters.Add("@denomination", SqlDbType.VarChar, 100);
//                parm.Value = _prestataire_firme;
//
//               
//
//                parm = cmd.Parameters.Add("@legalid", SqlDbType.Int);
//                parm.Value = _formeid;
//
//                parm = cmd.Parameters.Add("@natonalite", SqlDbType.Int);
//                parm.Value = _NationaliteID;
//
//                parm = cmd.Parameters.Add("@date", SqlDbType.DateTime);
//                parm.Value = _dateconstitution;
//
//                parm = cmd.Parameters.Add("@adresse", SqlDbType.VarChar,100);
//                parm.Value = _adresse;
//
//            
//
//                parm = cmd.Parameters.Add("@commune", SqlDbType.Int);
//                parm.Value = _CommuneID;
//
//                parm = cmd.Parameters.Add("@telefone", SqlDbType.VarChar,50);
//                parm.Value = _telephone;
//
//                parm = cmd.Parameters.Add("@cellulaire", SqlDbType.VarChar, 50);
//                parm.Value = _cellulaire;
//
//                parm = cmd.Parameters.Add("@email", SqlDbType.VarChar, 50);
//                parm.Value = _email;
//
//                parm = cmd.Parameters.Add("@fax", SqlDbType.VarChar, 50);
//                parm.Value = _fax;
//
//                parm = cmd.Parameters.Add("@web", SqlDbType.VarChar, 50);
//                parm.Value = _website;
//
//                parm = cmd.Parameters.Add("@patente", SqlDbType.NVarChar, 50);
//                parm.Value = _patente;
//
//                parm = cmd.Parameters.Add("@secteur", SqlDbType.VarChar, 50);
//                parm.Value = _secteur;
//
//                parm = cmd.Parameters.Add("@nif", SqlDbType.VarChar, 50);
//                parm.Value = _nif;
//
//                parm = cmd.Parameters.Add("@affiliation", SqlDbType.VarChar, 50);
//                parm.Value = _affiliation;
//
//                parm = cmd.Parameters.Add("@chiffre", SqlDbType.VarChar);
//                parm.Value = _chiffreAffaires;
//
//                parm = cmd.Parameters.Add("@cout", SqlDbType.VarChar);
//                parm.Value = _coutsAdministratifs;
//
//                //cmd.Parameters.Add("@id", SqlDbType.Int).Direction = ParameterDirection.Output;
//
//
//                 cmd.ExecuteNonQuery();
//                
//
//            }
//            catch
//            {
//
//            }
//
//            finally
//            {
//                con.Close();
//
//            }
//           
//        }

//        }
    }