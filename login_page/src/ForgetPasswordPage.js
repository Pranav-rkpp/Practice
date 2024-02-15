import phoneIcon from "./image/PhoneIcon.png"
import "./css/App.css";
import SideImage from './Layout/SideImage';
import { Link } from 'react-router-dom';
import { FaArrowLeft } from "react-icons/fa";

function ForgetPasswordPage() {
  return (
    <>
      <h2 className="welcomeText">Welcome back</h2>
      <div className="main">
          <SideImage/>
          <div className='content'>
            <div className="boxBackground">
                <Link to='/' style={{color:'black'}}><FaArrowLeft /></Link>
                <h2 className="subtitle">Forget Password</h2>
                <div className="phoneNumber">
                    <input type="number" placeholder="Enter your phone number"/>
                    <img src={phoneIcon} alt="PhoneIcone"></img>
                </div>
                <button><Link to='/OTPPage'>Send OTP</Link></button>
            </div>
           </div>
       </div>
    </>
  );
}

export default ForgetPasswordPage;