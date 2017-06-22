/**
 * Licensee: Universidade do Minho
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListDigitalSignageData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Cliente...");
		implementacao.Cliente[] implementacaoClientes = implementacao.ClienteDAO.listClienteByQuery(null, null);
		int length = Math.min(implementacaoClientes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(implementacaoClientes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Canal...");
		implementacao.Canal[] implementacaoCanals = implementacao.CanalDAO.listCanalByQuery(null, null);
		length = Math.min(implementacaoCanals.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(implementacaoCanals[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Conteudo...");
		implementacao.Conteudo[] implementacaoConteudos = implementacao.ConteudoDAO.listConteudoByQuery(null, null);
		length = Math.min(implementacaoConteudos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(implementacaoConteudos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing FicheiroMultimedia...");
		implementacao.FicheiroMultimedia[] implementacaoFicheiroMultimedias = implementacao.FicheiroMultimediaDAO.listFicheiroMultimediaByQuery(null, null);
		length = Math.min(implementacaoFicheiroMultimedias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(implementacaoFicheiroMultimedias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing PrevisaoTempo...");
		implementacao.PrevisaoTempo[] implementacaoPrevisaoTempos = implementacao.PrevisaoTempoDAO.listPrevisaoTempoByQuery(null, null);
		length = Math.min(implementacaoPrevisaoTempos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(implementacaoPrevisaoTempos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing FeedRSS...");
		implementacao.FeedRSS[] implementacaoFeedRSSs = implementacao.FeedRSSDAO.listFeedRSSByQuery(null, null);
		length = Math.min(implementacaoFeedRSSs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(implementacaoFeedRSSs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Rede...");
		implementacao.Rede[] implementacaoRedes = implementacao.RedeDAO.listRedeByQuery(null, null);
		length = Math.min(implementacaoRedes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(implementacaoRedes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Player...");
		implementacao.Player[] implementacaoPlayers = implementacao.PlayerDAO.listPlayerByQuery(null, null);
		length = Math.min(implementacaoPlayers.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(implementacaoPlayers[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Coordenada...");
		implementacao.Coordenada[] implementacaoCoordenadas = implementacao.CoordenadaDAO.listCoordenadaByQuery(null, null);
		length = Math.min(implementacaoCoordenadas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(implementacaoCoordenadas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Cliente by Criteria...");
		implementacao.ClienteCriteria implementacaoClienteCriteria = new implementacao.ClienteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//implementacaoClienteCriteria.ID.eq();
		implementacaoClienteCriteria.setMaxResults(ROW_COUNT);
		implementacao.Cliente[] implementacaoClientes = implementacaoClienteCriteria.listCliente();
		int length =implementacaoClientes== null ? 0 : Math.min(implementacaoClientes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(implementacaoClientes[i]);
		}
		System.out.println(length + " Cliente record(s) retrieved."); 
		
		System.out.println("Listing Canal by Criteria...");
		implementacao.CanalCriteria implementacaoCanalCriteria = new implementacao.CanalCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//implementacaoCanalCriteria.ID.eq();
		implementacaoCanalCriteria.setMaxResults(ROW_COUNT);
		implementacao.Canal[] implementacaoCanals = implementacaoCanalCriteria.listCanal();
		length =implementacaoCanals== null ? 0 : Math.min(implementacaoCanals.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(implementacaoCanals[i]);
		}
		System.out.println(length + " Canal record(s) retrieved."); 
		
		System.out.println("Listing Conteudo by Criteria...");
		implementacao.ConteudoCriteria implementacaoConteudoCriteria = new implementacao.ConteudoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//implementacaoConteudoCriteria.ID.eq();
		implementacaoConteudoCriteria.setMaxResults(ROW_COUNT);
		implementacao.Conteudo[] implementacaoConteudos = implementacaoConteudoCriteria.listConteudo();
		length =implementacaoConteudos== null ? 0 : Math.min(implementacaoConteudos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(implementacaoConteudos[i]);
		}
		System.out.println(length + " Conteudo record(s) retrieved."); 
		
		System.out.println("Listing FicheiroMultimedia by Criteria...");
		implementacao.FicheiroMultimediaCriteria implementacaoFicheiroMultimediaCriteria = new implementacao.FicheiroMultimediaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//implementacaoFicheiroMultimediaCriteria.ID.eq();
		implementacaoFicheiroMultimediaCriteria.setMaxResults(ROW_COUNT);
		implementacao.FicheiroMultimedia[] implementacaoFicheiroMultimedias = implementacaoFicheiroMultimediaCriteria.listFicheiroMultimedia();
		length =implementacaoFicheiroMultimedias== null ? 0 : Math.min(implementacaoFicheiroMultimedias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(implementacaoFicheiroMultimedias[i]);
		}
		System.out.println(length + " FicheiroMultimedia record(s) retrieved."); 
		
		System.out.println("Listing PrevisaoTempo by Criteria...");
		implementacao.PrevisaoTempoCriteria implementacaoPrevisaoTempoCriteria = new implementacao.PrevisaoTempoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//implementacaoPrevisaoTempoCriteria.ID.eq();
		implementacaoPrevisaoTempoCriteria.setMaxResults(ROW_COUNT);
		implementacao.PrevisaoTempo[] implementacaoPrevisaoTempos = implementacaoPrevisaoTempoCriteria.listPrevisaoTempo();
		length =implementacaoPrevisaoTempos== null ? 0 : Math.min(implementacaoPrevisaoTempos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(implementacaoPrevisaoTempos[i]);
		}
		System.out.println(length + " PrevisaoTempo record(s) retrieved."); 
		
		System.out.println("Listing FeedRSS by Criteria...");
		implementacao.FeedRSSCriteria implementacaoFeedRSSCriteria = new implementacao.FeedRSSCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//implementacaoFeedRSSCriteria.ID.eq();
		implementacaoFeedRSSCriteria.setMaxResults(ROW_COUNT);
		implementacao.FeedRSS[] implementacaoFeedRSSs = implementacaoFeedRSSCriteria.listFeedRSS();
		length =implementacaoFeedRSSs== null ? 0 : Math.min(implementacaoFeedRSSs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(implementacaoFeedRSSs[i]);
		}
		System.out.println(length + " FeedRSS record(s) retrieved."); 
		
		System.out.println("Listing Rede by Criteria...");
		implementacao.RedeCriteria implementacaoRedeCriteria = new implementacao.RedeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//implementacaoRedeCriteria.ID.eq();
		implementacaoRedeCriteria.setMaxResults(ROW_COUNT);
		implementacao.Rede[] implementacaoRedes = implementacaoRedeCriteria.listRede();
		length =implementacaoRedes== null ? 0 : Math.min(implementacaoRedes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(implementacaoRedes[i]);
		}
		System.out.println(length + " Rede record(s) retrieved."); 
		
		System.out.println("Listing Player by Criteria...");
		implementacao.PlayerCriteria implementacaoPlayerCriteria = new implementacao.PlayerCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//implementacaoPlayerCriteria.ID.eq();
		implementacaoPlayerCriteria.setMaxResults(ROW_COUNT);
		implementacao.Player[] implementacaoPlayers = implementacaoPlayerCriteria.listPlayer();
		length =implementacaoPlayers== null ? 0 : Math.min(implementacaoPlayers.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(implementacaoPlayers[i]);
		}
		System.out.println(length + " Player record(s) retrieved."); 
		
		System.out.println("Listing Coordenada by Criteria...");
		implementacao.CoordenadaCriteria implementacaoCoordenadaCriteria = new implementacao.CoordenadaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//implementacaoCoordenadaCriteria.ID.eq();
		implementacaoCoordenadaCriteria.setMaxResults(ROW_COUNT);
		implementacao.Coordenada[] implementacaoCoordenadas = implementacaoCoordenadaCriteria.listCoordenada();
		length =implementacaoCoordenadas== null ? 0 : Math.min(implementacaoCoordenadas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(implementacaoCoordenadas[i]);
		}
		System.out.println(length + " Coordenada record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListDigitalSignageData listDigitalSignageData = new ListDigitalSignageData();
			try {
				listDigitalSignageData.listTestData();
				//listDigitalSignageData.listByCriteria();
			}
			finally {
				implementacao.DigitalSignagePersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
