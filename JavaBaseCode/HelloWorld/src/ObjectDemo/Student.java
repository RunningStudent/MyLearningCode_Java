package ObjectDemo;



public class Student {

	private String name;
	private int ID;
	public Student() {
		super();
	}

	
	public String getName() {
		return name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		//�����Ż�
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		//�ж��ֽ�������Ƿ���ͬ
		if (getClass() != obj.getClass())
			return false;
		
		Student other = (Student) obj;
		
		//���ݶԱ�
		if (ID != other.ID)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public void setName(String name) {
	
		
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}

	
	
}
