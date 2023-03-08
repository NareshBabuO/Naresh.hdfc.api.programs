package com.hdfc.jdbc.entity;

/*@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data*/
public class HospitalEntity {

	private int id;
	private String name;
	private String founder;
	private int since;
	
	public HospitalEntity() {
		// TODO Auto-generated constructor stub
	}

	public HospitalEntity(int id, String name, String founder, int since) {
		super();
		this.id = id;
		this.name = name;
		this.founder = founder;
		this.since = since;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getFounder() {
		return founder;
	}

	public int getSince() {
		return since;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public void setSince(int since) {
		this.since = since;
	}

	@Override
	public String toString() {
		return "HospitalEntity [id=" + id + ", name=" + name + ", founder=" + founder + ", since=" + since + "]";
	}

}
