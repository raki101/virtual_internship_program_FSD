const slideImage = document.querySelectorAll("#slider-images")
const slide = document.querySelector("#slide");
const prevBtn = document.querySelector("#left");
const nextBtn = document.querySelector("#right");

function init()
{
    slideImage.forEach((img,i)=>{
        img.style.left = i*100 + "%";
    })

    slideImage[0].classList.add(active);
}

init()