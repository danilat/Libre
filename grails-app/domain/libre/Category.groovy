package libre

class Category {
	String name
	static hasMany = [items: Item]

    static constraints = {
		name()
    }

	String toString(){
		name
	}
}
