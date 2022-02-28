import { useResource } from "./useResource";

const HelloWorld = () => {
  const message = useResource(`/hello`);
  return <h1>{message}</h1>;
};

export default HelloWorld;
