/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidade do Minho
 * License Type: Academic
 */
package implementacao;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ConteudoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression _conteudoId;
	public final AssociationExpression _conteudo;
	public final IntegerExpression _canalId;
	public final AssociationExpression _canal;
	public final TimeExpression Duracao;
	
	public ConteudoDetachedCriteria() {
		super(implementacao.Conteudo.class, implementacao.ConteudoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		_conteudoId = new IntegerExpression("_conteudo.ID", this.getDetachedCriteria());
		_conteudo = new AssociationExpression("_conteudo", this.getDetachedCriteria());
		_canalId = new IntegerExpression("_canal.ID", this.getDetachedCriteria());
		_canal = new AssociationExpression("_canal", this.getDetachedCriteria());
		Duracao = new TimeExpression("Duracao", this.getDetachedCriteria());
	}
	
	public ConteudoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, implementacao.ConteudoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		_conteudoId = new IntegerExpression("_conteudo.ID", this.getDetachedCriteria());
		_conteudo = new AssociationExpression("_conteudo", this.getDetachedCriteria());
		_canalId = new IntegerExpression("_canal.ID", this.getDetachedCriteria());
		_canal = new AssociationExpression("_canal", this.getDetachedCriteria());
		Duracao = new TimeExpression("Duracao", this.getDetachedCriteria());
	}
	
	public TipoDetachedCriteria create_conteudoCriteria() {
		return new TipoDetachedCriteria(createCriteria("_conteudo"));
	}
	
	public CanalDetachedCriteria create_canalCriteria() {
		return new CanalDetachedCriteria(createCriteria("_canal"));
	}
	
	public Conteudo uniqueConteudo(PersistentSession session) {
		return (Conteudo) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Conteudo[] listConteudo(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Conteudo[]) list.toArray(new Conteudo[list.size()]);
	}
}

