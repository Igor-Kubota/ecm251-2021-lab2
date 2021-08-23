fun main() {
    val r = khttp.get("https://viacep.com.br/ws/09195310/json/")
    println(r.statusCode)

// 200
    println(r.headers["Content-Type"])
// "application/json; charset=utf-8"
    println(r.text)
// """{"type": "User"..."""
    println(r.jsonObject["uf"])
// org.json.JSONObject
}