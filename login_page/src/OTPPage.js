import { Link } from "react-router-dom";
import "./css/App.css";
import SideImage from './Layout/SideImage';
import { FaArrowLeft } from "react-icons/fa";

function OTPPage() {
  return (
    <>
      <h2 className="welcomeText">Welcome back</h2>
      <div className="main">
          <SideImage/>
          <div className='content'>
          <div className="boxBackground">
            <Link to='/ForgetPasswordPage' style={{color:'black'}}><FaArrowLeft /></Link>
            <h2 className="subtitle">OTP Verification</h2>
            <div className="otp">
                <input type="number" maxLength={1}/>
                <input type="number" maxLength={1}/>
                <input type="number" maxLength={1}/>
                <input type="number" maxLength={1}/>
            </div>
            <div className="verifyButton">
              <button><Link to='/NewPasswordCreatePage'>Verify</Link></button>
              <p><span>Did receive OTP?<a href="/">Resend</a></span></p>
            </div>
            </div>
          </div>
       </div>
    </>
  );
}

export default OTPPage;