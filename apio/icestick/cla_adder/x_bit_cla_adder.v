
module x_bit_cla_adder #(
parameter BITS = 8
)(
  input [BITS-1:0] in1, 
  input [BITS-1:0] in2,
  input cin,
  output [BITS-1:0] out
);
// generate fa 
wire gh_wire [BITS-1:0];
wire gl_wire [BITS-1:0];
wire ph_wire [BITS-1:0];
wire pl_wire [BITS-1:0];
wire ch_wire [BITS-1:0];
wire cl_wire [BITS-1:0];
wire cin_wire[BITS-1:0];
wire ghl_wire [BITS-1:0];
wire phl_wire [BITS-1:0];

genvar i;
genvar j;

assign cl_wire[0] = cin;


generate
  for (i = BITS - 1; i > BITS / 2; i = i - 1)  begin
    for (j = 0; j < BITS; j = j + 2) begin : gen_fa
      cla_fa u0 (
        in1[j],
        in2[j],
        cl_wire[i],
        out[j],
        pl_wire[i],
        gl_wire[i]);
      cla_fa u1 (
        in1[j+1],
        in2[j+1],
        ch_wire[i],
        out[j+1],
        ph_wire[i],
        gh_wire[i]
      );
  end
end
endgenerate
generate
    for (j = 0; j < BITS; j = j + 1) begin
      assign gh_wire[j] <= ghl_wire[j*2 + 1];
      assign ph_wire[j] <= phl_wire[j*2 + 1];
      assign ch_wire[j] <= cin_wire[j*2 + 1];
      assign gl_wire[j] <= ghl_wire[j*2 + 2];
      assign pl_wire[j] <= phl_wire[j*2 + 2];
      assign cl_wire[j] <= cin_wire[j*2 + 2];
      gpc u2 (
        .gh(gh_wire[j]),
        .ph(ph_wire[j]),
        .gl(gl_wire[j]),
        .pl(pl_wire[j]),
        .cin(cin_wire[j]),
        .cl(cl_wire[j]),
        .ghl(ghl_wire[j]),
        .phl(phl_wire[j]),
        .ch(ch_wire[j])
      );
  end
endgenerate
endmodule


