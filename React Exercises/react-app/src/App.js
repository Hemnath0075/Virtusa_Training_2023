import React from "react";
import "./App.css";
import SearchFilter from "./components/search-filter/SearchFilter.js";

function App() {
  return (
    <div className="app">
      <div>
        <h1 className="text-center color">Hello World!</h1>
        <SearchFilter />
      </div>
    </div>
  );
}
export default App;
