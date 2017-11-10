package school.domain;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

@RelationshipEntity(type = "TAUGHT_BY")
public class TaughtBy {
	
	private Long id;
	
	@StartNode private Subject subject;
	@EndNode private Teacher teacher;

}
