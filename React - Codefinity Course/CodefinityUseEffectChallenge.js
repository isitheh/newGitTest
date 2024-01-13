import React, { useState, useEffect } from 'react';
import fetchData from "../service/api";

const DataFetcher = () => {
    const [data, setData] = useState([]);
    const [error, setError] = useState(null);
    useEffect(() => { 
        fetchData()
            .then((resp) => {
                setData(resp.data);   
            })
            .catch((err) => {
                setError(err);
            });     
    }, []);
    return (
        <>
            {error ? (
                <p>{error}</p>
            ) : (
                data.length == 0 ? <p>loading data...</p> : 
                <ul>
                    {data.map((length, fact) => {
                        <li key={length}>
                            {fact}
                        </li>
                    })}
                </ul>
            )}
        </>
    );
}

export default DataFetcher;