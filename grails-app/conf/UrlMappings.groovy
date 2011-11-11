class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}
		
		"/lololo"(controller:"hi", action:"bar")

		"/"(view:"/index")
		"500"(view:'/error')
	}
}
