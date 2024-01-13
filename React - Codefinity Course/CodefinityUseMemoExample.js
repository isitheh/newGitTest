import React, { useMemo } from 'react';

const ShoppingCart = ({ products }) => {
    const totalCartPrice = useMemo(() => {
        let sum = 0;
        for( product of products) {
            sum += product.price * product.quantity;
        }
        return sum;
    }, [products]);
    return (
        <>
            <h2>Shopping Cart</h2>
            <ul>
                {products.map(({id, name, price, quantity}) => {
                    <li key={id}>
                        <p>
                            <span>{name}</span>
                            <span>${price}</span>
                            <span>{quantity}</span>
                        </p>
                    </li>
                })}
            </ul>
            <h3>Total Price: ${totalCartPrice}</h3>
        </>
    );
}

export default ShoppingCart;