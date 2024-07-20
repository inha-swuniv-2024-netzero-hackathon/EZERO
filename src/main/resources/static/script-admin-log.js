document.addEventListener('DOMContentLoaded', (event) => {
    fetch('path/to/your/api/endpoint')
        .then(response => response.json())
        .then(data => {
            const logContent = document.getElementById('log-content');
            data.forEach(item => {
                const logRow = document.createElement('div');
                logRow.classList.add('log-row');
                
                const dateItem = document.createElement('div');
                dateItem.classList.add('log-item');
                dateItem.textContent = item.date;

                const productNameItem = document.createElement('div');
                productNameItem.classList.add('log-item');
                productNameItem.textContent = item.productName;

                const quantityItem = document.createElement('div');
                quantityItem.classList.add('log-item');
                quantityItem.textContent = item.quantity;

                logRow.appendChild(dateItem);
                logRow.appendChild(productNameItem);
                logRow.appendChild(quantityItem);

                logContent.appendChild(logRow);
            });
        })
        .catch(error => console.error('Error fetching data:', error));
});
