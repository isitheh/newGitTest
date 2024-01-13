import React, { useState, useEffect } from 'react';
import fetchData from '../service/api;

const Article = () => {
	const [articles, setArticles] = useState([]);
	useEffect(() => {
		fetchData()
			.then((resp) => {
				setArticles(resp.jokes);
			})
			.catch((error) => {
				console.error(error);	
			});
	}, []);
	return (
		<>
		
		</>
	);
}

export default Article;