const BASE_SERVER = "http://localhost:8080"

document.getElementById("submit").onclick = () => {
    console.log("Post post!")
    let title = document.getElementById("title").value
    console.log(title)

    axios.post(BASE_SERVER + "/post", {
        title: title,
        description: "Cool post"
    })
}

function updatePosts(){
    axios.get(BASE_SERVER + "/post").then((res) => {
        let posts = JSON.parse(res.data)

        let postList = document.getElementById("post-list")
        postList.innerHTML = '';

        for(let i = 0; i < posts.length; i++){
            let item = document.createElement("li")
            item.innerText=posts[i].title
            postList.appendChild(item)
        }
    })
}

updatePosts()