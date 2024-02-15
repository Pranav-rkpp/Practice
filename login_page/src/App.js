
import "./css/App.css";
import { Route, Routes } from 'react-router-dom';
import LoginPage from "./LoginPage"
import ForgetPasswordPage from "./ForgetPasswordPage";
import OTPPage from "./OTPPage";
import NewPasswordCreatePage from "./NewPasswordCreatePage";

function App() {
  return (
    <div className="App">
      <Routes>
        <Route path='/' element={<LoginPage />} />
        <Route path="/ForgetPasswordPage" element={<ForgetPasswordPage/>}/>
        <Route path="/OTPPage" element={<OTPPage/>}/>
        <Route path="/NewPasswordCreatePage" element={<NewPasswordCreatePage/>}/>
      </Routes>
    </div>
  );
}

export default App;
