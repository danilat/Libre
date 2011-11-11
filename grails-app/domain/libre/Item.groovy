package libre

class Item {
	String name
	String address
	static belongsTo = [category: Category]

    static constraints = {
		name(blank:true, nullable:true)
		address()
    }

	String toString(){
		name
	}
}
