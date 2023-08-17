package com.masonwang.pnp.web;

import com.masonwang.pnp.entity.Proposal;
import com.masonwang.pnp.service.ProposalService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@AllArgsConstructor
@RestController
@RequestMapping("/proposal")
public class ProposalController {
    private ProposalService proposalService;

    @GetMapping("/{id}")
    public ResponseEntity<Proposal> getProposal(@PathVariable Long id) {
        return new ResponseEntity<>(proposalService.getProposal(id), HttpStatus.OK);
    }

    @PostMapping("/user/{userId}")
    public ResponseEntity<Proposal> saveProposal(@PathVariable Long userId, @RequestBody Proposal proposal) {
        return new ResponseEntity<>(proposalService.saveProposal(userId, proposal), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteProposal(@PathVariable Long id) {
        proposalService.deleteProposal(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Proposal> updateProposal(@PathVariable Long id, @RequestBody Proposal proposal) {
        return new ResponseEntity<>(proposalService.updateProposal(id, proposal), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Proposal>> getProposals() {
        return new ResponseEntity<>(proposalService.getProposals(), HttpStatus.OK);
    }

}
