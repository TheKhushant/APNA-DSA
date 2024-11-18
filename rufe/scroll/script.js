// JavaScript to handle scroll animation
window.addEventListener('scroll', function() {
    let scrollPosition = window.scrollY;
    
    let box1 = document.getElementById('box1');
    let box2 = document.getElementById('box2');

    // The distance that we will move the boxes based on scroll position
    let moveDistance = scrollPosition * 0.2; // Modify multiplier to adjust speed

    // Animate box1 (left to right)
    box1.style.transform = `translateX(${moveDistance}px) translateY(-50%)`;

    // Animate box2 (right to left)
    box2.style.transform = `translateX(${-moveDistance}px) translateY(-50%)`;
});
