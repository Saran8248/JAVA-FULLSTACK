document.addEventListener('DOMContentLoaded', () => {
    const printButton = document.getElementById('printButton');
    const valueInput = document.getElementById('valueInput');

    printButton.addEventListener('click', () => {
        const value = valueInput.value;
        console.log(`Entered Value: ${value}`);
        alert(`Entered Value: ${value}`);
    });
});
