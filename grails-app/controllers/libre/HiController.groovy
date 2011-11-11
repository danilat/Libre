package libre

class HiController {
	def geocodingService

    def index() { 
		render("hola")
	}
	def details(){
		def workshop = params.taller
		render(view: "show", model:[organization: 'CachiruloValley', workshop: workshop])
	}
	def foo(){
		redirect(action:'index')
	}
	def bar(){
		render("bar")
	}
	def penguin(){
		render(geocodingService.findLatLngByAddress("Avenida Goya 68, Zaragoza, Aragon"))
	}
}
