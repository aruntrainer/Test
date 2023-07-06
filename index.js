console.log("this is my indexjs file");
//Grab the news container
let newsAccordion = document.getElementById("newsAccordion");
//create a get request
const xhr = new XMLHttpRequest();
xhr.open(
    "GET",
    `https://newsapi.org/v2/top-headlines?country=in&category=business&apiKey=a21a22d8cf374245becde4ed68b23fd7`,
    true
);
xhr.onload = function() {
    if (this.status === 200) {
        let json = JSON.parse(this.responseText);
        let articles = json.articles;
        // console.log(articles);
        let newsHTML = "";
        articles.forEach(function(element, index) {
            let news = `<div class="card">
<div class="accordion-item">
<h2 class="accordion-header" id="heading${index}">
<button class="accordion-button" type="button" data-bs-toggle="collapse" data-bs-target="#collapse${index}"aria-expanded="true" aria-controls="collapse${index}">
<b>Breaking News${index+1}:__</b> ${element["title"]}
</button>
</h2>
<div id="collapse${index}" class="accordion-collapse collapse" aria-labelledby="heading${index}" data-bs-parent="#accordionExample">
<div class="accordion-body">${element["description"]}. <a href="${element['url']} " target="_blank">Read more at here</a>
</div>
</div>
</div>`;

            newsHTML += news;
        });
        newsAccordion.innerHTML = newsHTML;
    } else {
        console.log("Some error occured");
    }
};
xhr.send();