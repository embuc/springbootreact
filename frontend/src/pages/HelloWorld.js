import { useEffect, useState } from "react";
import axios from "axios";

const HelloWorld = () => {
    const [message, setMessage] = useState('');

	useEffect(() => {
		(async () => {
			const response = await axios.get('/hello');
			setMessage(response.data);
		})();
	}, []);

	return <h1>{message}</h1>;
}

export default HelloWorld;